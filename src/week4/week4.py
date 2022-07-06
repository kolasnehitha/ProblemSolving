LocationsList = ['A', 'B', 'C']
def checkLocation(startLocation, endLocation):
    if startLocation in LocationsList and endLocation in LocationsList:
        return True
    else:
        return False
Distance = [[0, 2, 3], [2, 0, 5], [3, 5, 0]]
def distance(startLocation, endLocation):
    xCordinate = int(LocationsList.index(startLocation))
    yCordinate = int(LocationsList.index(endLocation))
    return int(Distance[xCordinate][yCordinate])
def twoWheelerEstimation(distance):
    return distance*1
def fourWheelerEstimation(distance):
    return distance*2
startLocation = input("Enter start Location")
endLocation = input("Enter end Location")
if not checkLocation(startLocation, endLocation):
    print("check entered locations")
else:
    routeDistance = distance(startLocation, endLocation)
    print("Distance from start point to end point is ", routeDistance)
    transport = int(input("Enter type of transport 1-> Two wheeler 2-> Four Wheeler"))
    if transport == 1:
    print(" Time estimation is ",twoWheelerEstimation(routeDistance))
    else:
        print(" Time estimation is ",fourWheelerEstimation(routeDistance))

        
